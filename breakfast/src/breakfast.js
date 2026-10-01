 function areInLove (manpetal, womanpetal) {
    const manPetal = manpetal % 2 === 0;
    const womanPetal = womanpetal % 2 === 0;

    if(manPetal !== womanPetal){
        return true;
    }
    else{
        return false;
    }

}
 module.exports = { areInLove } ;