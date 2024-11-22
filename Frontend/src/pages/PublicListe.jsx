import axios from "axios"
import {useEffect, useState} from "react"
 
export default function PublicListe(){
 
    const [liste, setListe] = useState([]);
 
    useEffect(() => {

        axios.get("http://localhost:8080/")
    .then(response => {
        setListe(response.data);
    })
    .catch(error => console.log(error));
    }, [])
 
    return (
        <>
        <h2>Publicliste</h2>
        <ul>
            {liste.map(item => <li key={item}>{item}</li>)}
        </ul>
        </>
    )
}