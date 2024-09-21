var minimumCost = function (cost) {
  // If there are less than 3 items, just return their sum
  if (cost.length < 3) {
    return cost.reduce((a, b) => a + b, 0);
  }

  // Sort the costs in descending order (highest cost first)
  cost.sort((a, b) => b - a);

  let sum = 0;

  // Iterate over the array, skipping every third item (i.e., i % 3 === 2)
  for (let i = 0; i < cost.length; i++) {
    // Skip every third item
    if (i % 3 === 2) {
      continue;
    }
    sum += cost[i]; // Add other items to the sum
  }

  return sum;
};

console.log(minimumCost([1, 2, 3]));
console.log(minimumCost([2, 6]));
