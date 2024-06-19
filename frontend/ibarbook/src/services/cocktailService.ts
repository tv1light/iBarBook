import axios from 'axios';

const API_URL = 'http://localhost:8080';

export const getCocktails = async () => {
    const response = await axios.get(`${API_URL}/cocktails/all`);
    return response.data;
};

export const getCocktailById = async (id: string) => {
    const response = await axios.get(`${API_URL}/cocktails/${id}`);
    return response.data;
};