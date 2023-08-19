function serializeArray(arr) {
  let ans = "";
  for (let i = 0; i < arr.length; i++) {
    ans += arr[i];
    let len = arr[i].length;
    ans += len;
    ans += "~";
  }
  return ans;
}
function deserializeArray(serializedStr) {
  const originalArray = [];
  const regex = /([a-z]+)(\d+)~/g;
  let match = [];

  while ((match = regex.exec(serializedStr))) {
    const word = match[1];
    const length = parseInt(match[2]);
    console.log(length);
    originalArray.push(word);
  }

  return originalArray;
}

// // Test case
// const arrayToSerialize = ["interviewbit", "hello", "world"];
// const serializedString = serializeArray(arrayToSerialize);
// console.log(serializedString);
const serializedString = "interviewbit12~hello5~world5~";
const deserializedArray = deserializeArray(serializedString);
console.log(deserializedArray);
