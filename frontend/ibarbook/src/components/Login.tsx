import React from 'react';
import './Login.css';

const Login: React.FC = () => {
    return (
        <div className="login-container">
            <div className="login-box">
                <div className="logo">iBarBook</div>
                <p className="description">Авторизируйтесь, для того чтобы получить дополнительные возможности</p>
                <input type="text" placeholder="Username" className="input-field" />
                <input type="password" placeholder="Password" className="input-field" />
                <div className="actions">
                    <button className="login-button">Войти</button>
                    <a href="#" className="forgot-password">Забыли пароль</a>
                </div>
                <a href="/register" className="register-link">Регистрация</a>
            </div>
        </div>
    );
};

export default Login;