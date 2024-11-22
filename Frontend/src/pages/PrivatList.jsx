import axios from "axios"
import {useEffect, useState} from "react"
import AuthService from "../services/auth.serviece";
 
export default function PrivatList(){
 
    const [liste, setListe] = useState([]);
 
    useEffect(() => {
        const token = JSON.parse(localStorage.getItem("user")).token
 
        axios.get("http://localhost:8080/items", {
            "headers": {
                "Authorization": `Bearer ${token}`
            }
        })
    .then(response =>
        setListe(response.data)
    )
    .catch(error => console.log(error));
    }, [])
 
    return (
        <>
        <h2>PrivateList</h2>
        <ul>
            {liste.map(item => <li key={item}>{item}</li>)}
        </ul>
        </>
    )
}