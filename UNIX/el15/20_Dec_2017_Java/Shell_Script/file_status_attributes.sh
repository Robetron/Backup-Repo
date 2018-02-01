#!/bin/bash

echo "Enter the file fullpath."
read filepath

if [ -e "$filepath" ]
then
	echo "$filepath exists."
	filetype=`stat -c "%F" "$filepath"`
	absolutepermission=`stat -c "%a" "$filepath"`
	relativepermission=`stat -c "%A" "$filepath"`
	filesize=`stat -c "%s" "$filepath"`

	echo "Path: $filepath"
	echo "Type: $filetype"
	echo "Absolute Permissions: $absolutepermission"
	echo "Relative Permissiona: $relativepermission"
else
	echo "$filepath does not exist."
fi
