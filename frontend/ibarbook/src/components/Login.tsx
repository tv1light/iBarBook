import React, { useState } from 'react';
import './Login.css';
import { useNavigate } from 'react-router-dom';
import axios from "axios";

const Login: React.FC = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState('');
    const history = useNavigate();


    const handleLogin = async () => {
            if (!username || !password) {
                setError('Please enter both username and password.');
                return;
            }
            const credentials = { username, password };
            await axios.post('http://localhost:8080/auth/login', credentials)
                .then(response => {console.log('Login successful:', response);
                history('/cocktails');
            })
                .catch (error => {
            console.error('Login failed:', error.response ? error.response.data : error.message);
        setError('Invalid username or password.');
        })


    };

    return (
        <div className="login-container">
            <div className="login-box">
                <div className="logo">iBarBook</div>
                <p className="description">Авторизируйтесь, для того чтобы получить дополнительные возможности</p>
                <input
                    type="text"
                    placeholder="Username"
                    className="input-field"
                    value={username}
                    onChange={(e) => setUsername(e.target.value)}
                />
                <input
                    type="password"
                    placeholder="Password"
                    className="input-field"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                />
                <div className="actions">
                    <button className="login-button" onClick={handleLogin}>Войти</button>
                    <a href="#" className="forgot-password">Забыли пароль</a>
                </div>
                <a href="/register" className="register-link">Регистрация</a>
            </div>
        </div>
    );
};

export default Login;
