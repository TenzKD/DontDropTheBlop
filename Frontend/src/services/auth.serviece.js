import axios from "axios";
const API_URL = "http://localhost:8080/api/auth/";

const register = (username, email, password) => {
  return axios.post(API_URL + "signup", {
    username,
    email,
    password,
  });
};

const login = (username, password) => {
  return axios
    .post(API_URL + "login", { username, password })
    .then((response) => {
      if (response.data.username) {
        localStorage.setItem(
          "user",
          JSON.stringify(response.data)
        );
      }
      return response.data;
    });
};
const logout = () => {
  localStorage.removeItem("user");
};

const getCurrentUser = () => {
  return JSON.parse(
    localStorage.getItem("user")
  );
};

const saveScore = (username, score) => {
  return axios.post("http://localhost:8080/api/scores/" + "add", {
    username,
    score,
  });
};

const AuthService = {
  register,
  login,
  logout,
  getCurrentUser,
  saveScore,
};

export default AuthService;