function oToA(o){
    console.log(Object.entries(o))
}

const obj1 = {
    a: 'something',
    b: 87,
    c: true
};

const obj2 = {
    a: 'blah',
    b: 9875,
    c: false
};

const obj3 = {
    a: 'words words words',
    b: 8392,
    c: true
};

oToA(obj1);
oToA(obj2);
oToA(obj3);
