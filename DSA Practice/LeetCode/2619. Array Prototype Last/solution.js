Array.prototype.last = function() {
    const l = this.length;
    if (l){
        return this[l - 1];
    }

    return -1;
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */