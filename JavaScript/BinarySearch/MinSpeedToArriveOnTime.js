let isPossible = (dist, speed) => {
  let time = 0,
    totalSpeed = 0;
  let len = dist.length;
  for (let i = 0; i < len; i++) {
    i === len - 1
      ? (totalSpeed += dist[i] / speed)
      : (totalSpeed += Math.ceil(dist[i] / speed));
  }
  time = totalSpeed;
  return time;
};
let minSpeed = (dist, hour) => {
  let result = -1;
  let l = 0,
    r = Math.pow(10, 7);
  while (l <= r) {
    let mid = parseInt(l + (r - l) / 2);
    if (isPossible(dist, mid) <= hour) {
      result = mid;
      r = mid - 1;
    } else {
      l = mid + 1;
    }
  }
  // console.log(result);
  return result;
};
let ans = minSpeed([1, 3, 2], 1.9);
console.log(ans);
