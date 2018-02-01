#!/bin/bash

echo "------------------------------------------------------------------------------"
echo "Enter Folder Path"
read fpath

echo "Folder Size"
du -sh "$fpath"

echo "Folder Summary"
df -h "$fpath"