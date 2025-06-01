process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    let row = [];
    let column = [];
    
    for (let i = 0; i < a ; i++){
      row.push('*')
    }
    
    for (let j = 0; j < b ; j++){
      column.push(row.join(''))
    }
  
    console.log(column.join(`\n`))
});
