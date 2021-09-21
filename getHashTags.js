function getHashTags(headline){
    var words = headline.split(" ")
    var tags = []

    const sorted = words.sort((a,b) => b.length - a.length);

    if(words.length >=3){
        for(let i =0; i < 3; i++){
            tags[i] = "#"+sorted[i];
       }
    }
    else{
        for(let i =0; i < words.length; i++){
            tags[i] = "#"+sorted[i];
       }
    }
   
    return tags;
}

console.log(getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year"))