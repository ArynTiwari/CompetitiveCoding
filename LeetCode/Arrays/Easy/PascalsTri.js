var generate = function(numRows) {
    let number=[];
    for (let i = 0; i < numRows; i++) {
        number[i] = new Array(i+1);
        number[i][0]=1;
        number[i][i]=1;
        for (let j = 1; j < i; j++) {
            number[i][j]= number[i-1][j]+number[i-1][j-1];  
        }
    }
    return number
    
};