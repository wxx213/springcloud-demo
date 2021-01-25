#!/bin/bash

set -e

num=100

for((i=0;i<$num;i++)) do
	curl http://localhost:8087/index &
done
