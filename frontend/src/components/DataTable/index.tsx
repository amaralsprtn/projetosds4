const DataTable = () => {
    return (
        <div className="table-responsive">
        <table className="table table-striped table-sm">
            <thead>
                <tr>
                    <th>Data</th>
                    <th>Vendedor</th>
                    <th>Clientes visitados</th>
                    <th>Negócios fechados</th>
                    <th>Valor</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>22/04/2021</td>
                    <td>Dwight Schrute</td>
                    <td>15</td>
                    <td>22</td>
                    <td>15016.00</td>
                </tr>
                <tr>
                    <td>22/04/2021</td>
                    <td>Phyllys Vance</td>
                    <td>3</td>
                    <td>23</td>
                    <td>15017.00</td>
                </tr>
                <tr>
                    <td>22/04/2021</td>
                    <td>Stanley</td>
                    <td>323</td>
                    <td>24</td>
                    <td>15018.00</td>
                </tr>
                <tr>
                    <td>22/04/2021</td>
                    <td>Jim Halpert</td>
                    <td>1</td>
                    <td>25</td>
                    <td>15019.00</td>
                </tr>
                <tr>
                    <td>22/04/2021</td>
                    <td>Ryan</td>
                    <td>57</td>
                    <td>27</td>
                    <td>15020.00</td>
                </tr>
                <tr>
                    <td>22/04/2021</td>
                    <td>Pam Beesley</td>
                    <td>67</td>
                    <td>26</td>
                    <td>15021.00</td>
                </tr>
            </tbody>
        </table>
    </div>
    );
  };
  export default DataTable;
  