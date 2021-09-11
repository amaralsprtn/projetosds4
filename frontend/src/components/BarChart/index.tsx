import axios from 'axios';
import Chart from 'react-apexcharts';
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/requests';

type ChartData = {
    labels: string[];
    series: number[];
}
const BarChart = () => {

    let chartData : ChartData = { labels: [], series: []};
    
    axios.get(`${BASE_URL}/sales/amount-by-seller`)
        .then((response) => {
            const data = response.data as SaleSum[];
            const myLabels = data.map(x => x.sellerName);
            const mySeries = data.map(x=> x.sum);

            chartData = { labels: myLabels, series: mySeries};
            console.log(response.data);
        });

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };
    
    // const mockData = {
    //     labels: {
    //         categories: ['Pam', 'Jim', 'Stanley', 'Phyllys', 'Ryan', 'Dwight']
    //     },
    //     series: [
    //         {
    //             name: "% Sucesso",
    //             data: [43.6, 67.1, 67.7, 45.6, 71.1]                   
    //         }
    //     ]
    // };

    return (
        <Chart 
            options ={{...options, labels: chartData.labels}}
            series= {chartData.series}
            type= "bar"
            height="240"
        />
    );
  };
  export default BarChart;
  