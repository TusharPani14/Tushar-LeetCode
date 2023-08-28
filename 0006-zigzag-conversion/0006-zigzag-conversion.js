/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    if (numRows === 1 || s.length <= numRows) {
    return s;
  }
    var rows=[];
    for(var i=0;i<numRows;i++)
    {
        rows[i]="";
    }
    var currentRow=0
    var direction = -1
    for(var i=0;i<s.length;i++)
    {
        rows[currentRow]+=s[i]
        if(currentRow==0 || currentRow==numRows-1){
            direction*=-1;
        }
        currentRow+=direction
    }
    return rows.join("")
};