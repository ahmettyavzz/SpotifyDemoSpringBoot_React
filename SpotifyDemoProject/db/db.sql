PGDMP     1    %                 z            Spotify    14.3    14.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            	           1262    16807    Spotify    DATABASE     f   CREATE DATABASE "Spotify" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "Spotify";
                postgres    false            �            1259    16809    artists    TABLE     �   CREATE TABLE public.artists (
    artist_id integer NOT NULL,
    artist_name character varying NOT NULL,
    genre_id integer NOT NULL
);
    DROP TABLE public.artists;
       public         heap    postgres    false            �            1259    16808    Artist_artist_id_seq    SEQUENCE     �   CREATE SEQUENCE public."Artist_artist_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public."Artist_artist_id_seq";
       public          postgres    false    210            
           0    0    Artist_artist_id_seq    SEQUENCE OWNED BY     P   ALTER SEQUENCE public."Artist_artist_id_seq" OWNED BY public.artists.artist_id;
          public          postgres    false    209            �            1259    16827    genres    TABLE     i   CREATE TABLE public.genres (
    genre_id integer NOT NULL,
    genre_name character varying NOT NULL
);
    DROP TABLE public.genres;
       public         heap    postgres    false            �            1259    16826    Genres_genre_id_seq    SEQUENCE     �   CREATE SEQUENCE public."Genres_genre_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public."Genres_genre_id_seq";
       public          postgres    false    214                       0    0    Genres_genre_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public."Genres_genre_id_seq" OWNED BY public.genres.genre_id;
          public          postgres    false    213            �            1259    16818    songs    TABLE     �   CREATE TABLE public.songs (
    song_id integer NOT NULL,
    song_name character varying NOT NULL,
    artist_id integer NOT NULL,
    genre_id integer NOT NULL
);
    DROP TABLE public.songs;
       public         heap    postgres    false            �            1259    16817    Songs_song_id_seq    SEQUENCE     �   CREATE SEQUENCE public."Songs_song_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public."Songs_song_id_seq";
       public          postgres    false    212                       0    0    Songs_song_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public."Songs_song_id_seq" OWNED BY public.songs.song_id;
          public          postgres    false    211            �            1259    16895    artists_artist_id_seq    SEQUENCE     �   ALTER TABLE public.artists ALTER COLUMN artist_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.artists_artist_id_seq
    START WITH 4
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    210            h           2604    16830    genres genre_id    DEFAULT     t   ALTER TABLE ONLY public.genres ALTER COLUMN genre_id SET DEFAULT nextval('public."Genres_genre_id_seq"'::regclass);
 >   ALTER TABLE public.genres ALTER COLUMN genre_id DROP DEFAULT;
       public          postgres    false    214    213    214            g           2604    16821    songs song_id    DEFAULT     p   ALTER TABLE ONLY public.songs ALTER COLUMN song_id SET DEFAULT nextval('public."Songs_song_id_seq"'::regclass);
 <   ALTER TABLE public.songs ALTER COLUMN song_id DROP DEFAULT;
       public          postgres    false    211    212    212            �          0    16809    artists 
   TABLE DATA           C   COPY public.artists (artist_id, artist_name, genre_id) FROM stdin;
    public          postgres    false    210   �                 0    16827    genres 
   TABLE DATA           6   COPY public.genres (genre_id, genre_name) FROM stdin;
    public          postgres    false    214   e                  0    16818    songs 
   TABLE DATA           H   COPY public.songs (song_id, song_name, artist_id, genre_id) FROM stdin;
    public          postgres    false    212   �                  0    0    Artist_artist_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public."Artist_artist_id_seq"', 3, true);
          public          postgres    false    209                       0    0    Genres_genre_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public."Genres_genre_id_seq"', 7, true);
          public          postgres    false    213                       0    0    Songs_song_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public."Songs_song_id_seq"', 12, true);
          public          postgres    false    211                       0    0    artists_artist_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.artists_artist_id_seq', 11, true);
          public          postgres    false    215            j           2606    16816    artists artist_id 
   CONSTRAINT     V   ALTER TABLE ONLY public.artists
    ADD CONSTRAINT artist_id PRIMARY KEY (artist_id);
 ;   ALTER TABLE ONLY public.artists DROP CONSTRAINT artist_id;
       public            postgres    false    210            n           2606    16834    genres genre_id 
   CONSTRAINT     S   ALTER TABLE ONLY public.genres
    ADD CONSTRAINT genre_id PRIMARY KEY (genre_id);
 9   ALTER TABLE ONLY public.genres DROP CONSTRAINT genre_id;
       public            postgres    false    214            l           2606    16825    songs song_id 
   CONSTRAINT     P   ALTER TABLE ONLY public.songs
    ADD CONSTRAINT song_id PRIMARY KEY (song_id);
 7   ALTER TABLE ONLY public.songs DROP CONSTRAINT song_id;
       public            postgres    false    212            o           2606    16885    artists artist_genre_id     FK CONSTRAINT     �   ALTER TABLE ONLY public.artists
    ADD CONSTRAINT "artist_genre_id " FOREIGN KEY (genre_id) REFERENCES public.genres(genre_id) NOT VALID;
 D   ALTER TABLE ONLY public.artists DROP CONSTRAINT "artist_genre_id ";
       public          postgres    false    3182    210    214            p           2606    16845    songs artist_id_song    FK CONSTRAINT     �   ALTER TABLE ONLY public.songs
    ADD CONSTRAINT artist_id_song FOREIGN KEY (artist_id) REFERENCES public.artists(artist_id) NOT VALID;
 >   ALTER TABLE ONLY public.songs DROP CONSTRAINT artist_id_song;
       public          postgres    false    212    3178    210            q           2606    16890    songs genre_id_song    FK CONSTRAINT     �   ALTER TABLE ONLY public.songs
    ADD CONSTRAINT genre_id_song FOREIGN KEY (genre_id) REFERENCES public.genres(genre_id) NOT VALID;
 =   ALTER TABLE ONLY public.songs DROP CONSTRAINT genre_id_song;
       public          postgres    false    3182    212    214            �   v   x�3�tLOTp�4�2�)-HL�4�2�t,��4�2�tN�J
�r���&���9}���,N�Ģ�<������9��,9C���ʌ������@u���N�I
��E9��@kb���� ��{         ?   x�3���,��/�2� �ƜA���\&�AjN\��A��鉩\f���\�N9���\1z\\\ ���          �   x�-�AjA���S�	$=:��YLЀh6�l*��Ŵ��m:q�eB�e)�|��/�k�=yZq>��Ek�,�^8U4�f�^�K���[�c��K�wqU����|Hp���;M�{��Q���˝f�J�%Ж0SzĊ�X�A�9��-0Gc7��i�� ���SC�u/��������>~r�'Lt���sQu>�     