import axios from "axios";

export default class GenreService {
    getAllGenres() {
        return axios.get("http://localhost:8080/genres/getall")
    }
}
