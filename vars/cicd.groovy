def newGit(newRepo)
{
  git "https://github.com/DanielPrawin/${newRepo}.git"
}
def build()
{
  sh "mvn package"
}
def deploy(jobname, ip,contextpath)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}
def testing(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
