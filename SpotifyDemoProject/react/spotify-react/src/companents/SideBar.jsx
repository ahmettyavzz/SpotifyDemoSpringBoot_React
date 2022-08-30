import React, { useEffect, useState } from 'react'
import GenreService from '../services/genreService';
import { Button } from 'semantic-ui-react'



function SideBar(props)  {

  

const [genres, setGenre] = useState([])

useEffect(() => {
  let genreService = new GenreService()
  genreService.getAllGenres().then(result=>setGenre(result.data))




}, [])

    return (
      <div >
        <ul  className="list-group ">
          {genres.map(genre => (
            <Button onClick={()=>props.changeSelectedGenre(genre)} className="list-group-item"  inverted color='green'  key={genre.genreId} >{genre.genreName}</Button>
               
          ))}


        </ul>
      </div>
    )
  }


export default SideBar;
