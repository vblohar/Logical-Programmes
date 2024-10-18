function towerHanoi(discs) {
  return Math.pow(2, discs) - 1;
}
console.log(`${towerHanoi(5)} moves are required to solve the game`);
