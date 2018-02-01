#!/bin/bash

echo "1.Name 2.Type 3.Permission 4.Size 5.Empty 6.Max Depth"
echo "------------------------------------------------------------------------------"
echo "Choice"
read choice

case "$choice" in
1)
	echo "Enter full File Path"
	read fpath

	echo "Enter File Name in $fpath"
	read fname

	find "$fpath" -name "$fname" 2> /dev/null
;;
2)
	echo "Enter full File Path"
	read fpath
	
	echo "File Type"
	echo "b -block"
	echo "c -character"
	echo "d -directory"
	echo "p -named pipe"
	echo "f -regular link"
	echo "l -symbolic link"
	echo "s -socket"
	echo "D -door"
	
	echo "Enter full File Type"
	read ftype

	find "$fpath" -type "$ftype"
;;
3)
	echo "Enter full File Path"
 	read fpath
  
        echo "Enter File Permission"
    	read fperm
     
        find "$fpath" -perm "$fperm"
;;
4)
 	echo "Enter full File Path"
        read fpath
   
        echo "Enter File Size"
        read fsize
      	
	echo "Enter File Size Unit [b:block c:byte w:two-byte k:kB M:mB G:gB]"
       	read funit

        find "$fpath" -size "$fsize""$funit"
;;
5)
 	echo "Enter full File Path"
  	read fpath
   
      	find "$fpath" -empty
;;
6)
	echo "Enter full File Path"
        read fpath
  
        echo "Enter File Level"
        read flevel
     
        find "$fpath" -maxdepth "$flevel"
;;
*)
	echo "Invalid Option"
;;
esac
echo "------------------------------------------------------------------------------"
