import React, { Component } from 'react'
import {Table } from 'semantic-ui-react'


 class SongsList extends Component {

   bosMu= false

  render(){


    if ((this.props.songsProp.length) !== 0){
    
     this.bosMu=true
      
    }

 //console.log(this.props.genreProp);
//console.log(this.bosMu)

    return (

      
      <div>
 
          

        <h3 >{this.props.genreProp.genreName}</h3>
     
        
        
        <Table inverted>
      <Table.Header>
        <Table.Row>
          
          <Table.HeaderCell>Song Name</Table.HeaderCell>
          <Table.HeaderCell>Artist Name</Table.HeaderCell>
        
        </Table.Row>
      </Table.Header>
  
      <Table.Body >
      {this.bosMu ? this.props.songsProp.map(s=> 
      <Table.Row key={s.songId}>
      { (s.genreName === this.props.genreProp.genreName) 
      ? <><Table.Cell >{s.songName}</Table.Cell>
      <Table.Cell>{s.artistName}</Table.Cell> </>  : <></> /*console.log("aynı değil")*/ } 
        
         
        </Table.Row>
      )
      : <h1>sorun var</h1>}
        
  
      </Table.Body>
  
      <Table.Footer>
        <Table.Row>
          <Table.HeaderCell colSpan='2'>
           
          </Table.HeaderCell>
        </Table.Row>
      </Table.Footer>
    </Table>
      </div>
  
    )
  }


 
  
}

/* SongsList.defaultProps = {
  songsProp: {}
}
 */
export default SongsList;