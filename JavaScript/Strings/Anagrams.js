// Javascript program to check if two
// strings are anagrams of each other

function isAnagram(a, b) {
  if (a.length != b.length) {
    return false;
  }

  let map = new Map();

  for (let i = 0; i < a.length; i++) {
    if (map.has(a[i])) {
      map.set(a[i], map.get(a[i]) + 1);
    } else {
      map.set(a[i], 1);
    }
  }

  for (let i = 0; i < b.length; i++) {
    if (map.has(b[i])) {
      map.set(b[i], map.get(b[i]) - 1);
    }
  }

  let keys = map.keys();
  console.log(keys);
  for (let key of keys) {
    console.log(map.get(key));
    if (map.get(key) != 0) {
      return false;
    }
  }

  return true;
}

// Driver code
let str1 = "geeksforgeeks";
let str2 = "forgeeksgeeks";

// Function call
if (isAnagram(str1, str2))
  console.log("The two strings are" + " anagram of each other<br>");
else console.log("The two strings are not" + " anagram of each other<br>");

// This code is contributed by Pushpesh Raj
