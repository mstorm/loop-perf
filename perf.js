
var start = Date.now();
var sum = 0;

for (var i = 1; i <= process.argv[2]; ++i) {
    sum += Math.log2(i);
}

var elapsed = (Date.now() - start) / 1000;

console.log("Javascript: %ds\t%d", elapsed, sum);
