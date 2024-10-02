function solution(input) {
  function getAngle(coord1,coord2) {
    return ((coord2[1] - coord1[1]) / (coord2[0] - coord1[0])).toFixed(5)
  }
  const arrs = {};
  for(let i=0;i<4;i++) {
    for(let j=i+1;j<4;j++) {
      if(Object.keys(arrs).includes(getAngle(input[i],input[j])) && !arrs[getAngle(input[i],input[j])].includes(JSON.stringify(input[i])) && !arrs[getAngle(input[i],input[j])].includes(JSON.stringify(input[j]))) return 1
      else arrs[getAngle(input[i],input[j])] = [JSON.stringify(input[i]),JSON.stringify(input[j])]
    }
  }
  return 0
}