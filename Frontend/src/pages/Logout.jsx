import AuthService from "../services/auth.serviece";

const Logout = () => {
  return (
    <>
    <button onClick={() => AuthService.logout()} >Logout</button>
    </>
  )
}
export default Logout