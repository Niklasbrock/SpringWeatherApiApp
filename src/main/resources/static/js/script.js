function search(){
    let city = document.getElementById("search-input").value;
    let newurl = 'http://localhost:8080/'+city;
    window.location = newurl;
}

