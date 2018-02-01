# .bash_profile

#user define message
echo "Welcome $USER"
echo "Hello! Have a nice day!"

# Get the aliases and functions
if [ -f ~/.bashrc ]; then
	. ~/.bashrc
fi

export JAVA="`which java`"

# User specific environment and startup programs

PATH=$PATH:$HOME/bin:$JAVA

export PATH
