dev newGit(newRepo)
{
  echo "git https://github.com/DanielPrawin/${newRepo}.git"
}
dev build()
{
  echo "sh mvn package"
}
dev deploy(jobname, ip,contextpath)
{
  echo "sh scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}
dev testing(jobname)
{
  echo "sh java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
