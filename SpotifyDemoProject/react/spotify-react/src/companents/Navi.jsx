import React from 'react'
import { Menu ,Image, Dropdown} from 'semantic-ui-react'
//import { Input, Menu } from 'semantic-ui-react'

export default function Navi() {
  return (
    <div>
         <nav className="navbar navbar-expand-lg bg-dark">
  <div className="container-fluid">

    <a className="navbar-brand text-warning" href="/#">Spotify Demo</a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <a className="nav-link active " style={{color:"white"}} ariaCurrent="page" href="/">Home</a>
        </li>
        
      </ul>
    
   
        <Menu.Item>
            <Image avatar spaced="right" src="https://pickaface.net/gallery/avatar/LoremIpsum54ed2584ba1a0.png"/>
            <Dropdown pointing="top right" text='Ahmet Yavuz' style={{color:"#fff"}}>
                <Dropdown.Menu>
                        <Dropdown.Item  text="Profil" icon ="info"/>
                        <Dropdown.Item text= "Çıkış Yap" icon ="sign-out"/>          
                </Dropdown.Menu>
            </Dropdown>
        </Menu.Item>
    </div>
  </div>
</nav>

    </div>
  )
}
