# springboot-projects

Git commands 

1>Set Up Git
Install Git:
If you haven't installed Git on your computer, you can download and install it from the official website: Git Downloads.

2>Configure Git:
Open a terminal or command prompt and configure your Git username and email using the following commands:

git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"

3> clone 
git clone https://github.com/username/repo.git
4>Add and Commit Changes
Navigate to Your Project:
Move into the project directory:

   -cd repo
   -git add .
   -git commit -m "Your commit message here"
   -git push origin master


5>branches git push origin master


6>Set Upstream Branch
If you haven't set up the upstream branch, you might need to set it using the following command:
bash
Copy code
git branch --set-upstream-to=origin/main main
Replace "main" with your branch name if it's different.
Step 5: Retry Push
Try pushing your changes again:
bash
Copy code
git push

