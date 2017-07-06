#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

int main(int argc, char **argv) {
	int i, n;
	clock_t start;
	double elapsed, sum = 0;

	start = clock();

	n = atoi(argv[1]);

	for (i = 1; i <= n; ++i) {
		sum += (log(i) / log(2));
	}

	elapsed = (double) (clock() - start) / CLOCKS_PER_SEC;
	fprintf(stdout, "C: %.9fs\t%f\n", elapsed, sum);

	return 0;
}