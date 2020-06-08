import React, { Component } from 'react';
import axios from 'axios';
import Card from './WeatherCard';

class Main extends Component {

    constructor(props) {
        super(props);
        this.state = {
            weather: [],
            isFetching: false,

        }
    }

    fetch() {
        axios
            .get(`http://localhost:8080/api/v1/history`)
            .then(res => {
                console.log(res.data.weather)
                this.setState({
                    weather: res.data.weather,
                    isFetching: true,
                })
            })
            .catch(function (error) {
                console.log(error)
            })
    }

    componentDidMount() {
        this.fetch();
    }

    componentDidUpdate(prevProps, prevState) {
        
    }

    

    render() {
        var { isFetching, weather } = this.state;
        if (!isFetching) {
            return <div>Loading ....</div>
        }
        else {
            return (
                <div className="d-flex">
                    <div className="limiter">
                        <div className="container-table100">
                            <div className="wrap-table100">
                                <div className="table100 ver1 m-b-110 ">
                                    <div className="table100-head">
                                        <table>
                                            <thead>
                                                <tr className="row head text-center">
                                                    <th className="cell100 column1 ">Temperature</th>
                                                    <th className="cell100 column2 ">Latitude</th>
                                                    <th className="cell100 column3 ">Longitude </th>
                                                    <th className="cell100 column4 ">Date</th>
                                                    <th className="cell100 column5 ">Time</th>
                                                </tr>
                                            </thead>
                                        </table>
                                    </div>
    
                                    <div className="table100-body js-pscroll">
                                        <table>
                                            <tbody>
                                            {weather.map((weather) =>
                                            <Card
                                                id={weather.id}
                                                lat={weather.lat}
                                                lon={weather.lon}
                                                time={weather.observation_time.value}
                                                units={weather.temp.units}
                                                value={weather.temp.value}
                                                
                                            />)}                                      
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            )
        }
        
    }

}

export default Main;