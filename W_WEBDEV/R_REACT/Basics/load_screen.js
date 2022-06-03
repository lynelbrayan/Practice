const e = React.createElement;

class TicTacToe extends React.Container
{
  constructor(props)
  {
    super(props);
    this.i=9

  }
  render(i)
  {
    return (<div>{i}<br/></div> );
  }
}
const domContainer = document.querySelector('#frames');
const root = ReactDOM.createRoot(domContainer);
root.render(e(TicTacToe));