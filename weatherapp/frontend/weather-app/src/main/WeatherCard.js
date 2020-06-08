import React, { Component } from 'react';

class Card extends Component {


    render() {
        return (
            <tr className="row100 body " key={this.props.id}>
                <th className="cell100 column1">{this.props.value}&#8451;</th>
                <td className="cell100 column2">{this.props.lat}</td>
                <td className="cell100 column3">{this.props.lon}</td>
                <td className="cell100 column4">{this.props.time.slice(0, 10)}</td>
                <td className="cell100 column5">{this.props.time.slice(11, 16)}</td>
                
            </tr>
        );
    }
}

export default Card;