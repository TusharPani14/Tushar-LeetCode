/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
var divide = function(dividend, divisor) {
    if(dividend==-2147483648 && divisor == -1)
    return 2147483647
    if((dividend<0 && divisor>0)||(dividend>0 && divisor<0))
    return -(Math.floor(Math.abs(dividend)/Math.abs(divisor)))
    else
    return Math.floor(dividend/divisor)
};