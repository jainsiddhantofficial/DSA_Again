/**
 * @param {string} equation
 * @return {string}
 */
const solveEquation=e=>{const t=e.split("=");let n=evalSide(t[0]),c=evalSide(t[1]);return n.x-=c.x,n.c-=c.c,n.x?"x="+-n.c/n.x:n.c?"No solution":"Infinite solutions"};function evalSide(e){let t,n={x:0,c:0},c=/-?(\d*x|\d+)/g;for(;t=c.exec(e);){let e=t[0].replace("x","");t[0]===e?n.c+=parseInt(e):"-"===e?n.x--:n.x+=parseInt(e||1)}return n}