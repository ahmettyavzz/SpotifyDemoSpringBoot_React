import 'semantic-ui-css/semantic.min.css'
import { Container, Grid } from 'semantic-ui-react';
import React, { Component } from 'react'
import './App.css';
import Navi from './companents/Navi';
import SideBar from './companents/SideBar';
import SongsList from './companents/SongsList';
import axios from "axios";

class App extends Component {

  state = {
    genre:{},
    songs:[]
  }



 
  async componentDidMount(){
    const response =await axios.get("http://localhost:8080/songs/getall")

    //console.log(response.data)
    this.setState({ songs: response.data})  
  } 


  changeGenre=(gelenGenre) =>{
   this.setState({genre: gelenGenre})


   
  }


 

  render() {
    

    return (
      <div className="App">
        <Navi></Navi>
        <br></br>

        <Container >
          <Grid>
            <Grid.Row>
              <Grid.Column width={4}>
                <SideBar changeSelectedGenre={this.changeGenre} ></SideBar>
                {/*console.log(this.state.genre)*/}

              </Grid.Column>
              <Grid.Column width={12}>
                <SongsList genreProp={this.state.genre} songsProp={this.state.songs}></SongsList>
              </Grid.Column>
            </Grid.Row>
          </Grid>
        </Container>





      </div>
    );
  }

}

export default App;
