const compare = (a, b) => {
  const parts1 = a.split(".");
  const parts2 = b.split(".");

  const maxLength = Math.max(parts1.length, parts2.length);

  for (let i = 0; i < maxLength; i++) {
    const num1 = i < parts1.length ? parseInt(parts1[i]) : 0;
    const num2 = i < parts2.length ? parseInt(parts2[i]) : 0;

    if (num1 < num2) {
      return -1;
    } else if (num1 > num2) {
      return 1;
    }
  }

  return 0;
};
console.log(compare("643443896946", "2.487969654569425698"));
