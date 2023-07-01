/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let call = -1;
    return function() {
        call += 1;
        return call + n;    
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */