import {useState, useEffect , useRef} from 'react';
import '../src/com/WeatherDay/Main.css';

const App = () => {
  const [mv,setMv]=useState([]);
  const dRef=useRef();

  const handleChange=(e) =>{
      e.preventDefault();
      let dd =dRef.current.value.replaceAll('-','');
      console.log(dd);
      mvload(dd);
    }
    
    const mvload = (d)=>{
      //가져올데이터주소 
      //let promise=Fetch(url,[options])
      //성공시 then 실패시 catch
    const url ='https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=' +d;
    fetch(url)
    .then((resp)=>resp.json())
    //.then((resp)=>{return resp.json()})
    //Response 형태의 결과를 json으로 반환
    
    .then((data)=>{
      console.log('data=>',data)
      setMv(data.boxOfficeResult.dailyBoxOfficeList.map((m)=>m.movieNm));
    })
    .catch((err)=>{console.log(err)})
  }

    useEffect(()=>{
    let today = new Date();
    let year = today.getFullYear();
    let month = ('0'+(today.getMonth()+1)).slice(-2);
    let day = ('0'+(today.getDate())).slice(-2);
    let lastday = (year+month+day)-1;

      mvload('20221010')
    },[]);

// let p =fetch(url);
// console.log(p);
// p.then((Response)=>{console.log(Response)});
// p.catch((err)=>{console.log(err)});



return (
    <>
    <h2>비동기</h2>
    <form>
      <input type='date' ref={dRef} name='d' onChange={handleChange} />
    </form>
    {mv}
    </>
  );
}

export default App;
