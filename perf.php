<?php

$start = microtime(true);

$sum = 0;
for ($i = 1; $i <= $argv[1]; ++$i) {
    $sum += log($i, 2);
}

$elapsed = microtime(true) - $start;

printf("PHP: %f\t%f\n", $elapsed, $sum);
