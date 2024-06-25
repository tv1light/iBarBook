import React, {useState} from 'react';
import './RegisterPage.css';
import {useNavigate} from "react-router-dom";
import axios from "axios";

const RegisterPage: React.FC = () => {
    const [username, setUsername] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState(''); // State to manage error messages
    const history = useNavigate(); // Get the history object for redirection

    const handleSignup = async () => {
            // Check for empty fields
            if (!username || !email || !password) {
                setError('Please fill in all fields.');
                return;
            }

            const response = await axios.post('http://localhost:8080/auth/register', {
                username,
                email,
                password,
            }).then(response => {console.log(response.data);
            history('/cocktails');})
            // Handle successful signup

            .catch (error => {
            // Handle signup error
            console.error('Signup failed:', error.response ? error.response.data : error.message);
            setError(error.response ? error.response.data : error.message);
            })
    };
    return (
        <div className="register-page">
            <div className="register-container">
                <div className="logo">iBarBook</div>
                <div className="description">
                    Зарегистрируйтесь, для того чтобы получить дополнительные возможности
                </div>
                    <input type="text" placeholder="Username" className="input-field" />
                    <input type="email" placeholder="E-mail" className="input-field" />
                    <input type="password" placeholder="Password" className="input-field" />
                    <button type="submit" className="register-button">Зарегистрироваться</button>
                <div className="agreement">
                    Регистрируясь, вы соглашаетесь с <a href="/terms">пользовательским соглашением</a>
                </div>
            </div>
        </div>
    );
};

export default RegisterPage;
