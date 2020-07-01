node{
  def GITREPO         = "C:/git/databricks"
  def GITREPOREMOTE   = "https://ledcb761.frmon.danet/gogs/Incubator/databricks.git"
  def GITHUBCREDID    = "428795236bf09b04a7a9bd417f879400b78c8eb1"
  def CURRENTRELEASE  = "continous-integration"
  def DBTOKEN         = "databricks-id"
  def DBURL           = "https://dbc-35e3d831-3665.cloud.databricks.com/"
  def SCRIPTPATH      = "${GITREPO}/Automation/Deployments"
  def NOTEBOOKPATH    = "${GITREPO}/Workspace"
  def LIBRARYPATH     = "${GITREPO}/Libraries"
  def BUILDPATH       = "${GITREPO}/Builds/${env.JOB_NAME}-${env.BUILD_NUMBER}"
  def OUTFILEPATH     = "${BUILDPATH}/Validation/Output"
  def TESTRESULTPATH  = "${BUILDPATH}/Validation/reports/junit"
  def WORKSPACEPATH   = "/Shared/<path>"
  def DBFSPATH        = "dbfs:"
  def CLUSTERID       = "0527-101731-tiff5"
  def CONDAPATH       = "C:/ProgramData/Anaconda3"
  def CONDAENV        = "jen-env"

  stage('Setup') {
    withCredentials([string(credentialsId: DBTOKEN, variable: 'TOKEN')]) {
    bat """
        # Configure Conda environment for deployment & testing
        ${CONDAPATH}/Scripts/deactivate 
        ${CONDAPATH}/Scripts/activate ${CONDAENV}


        # Configure Databricks CLI for deployment
        echo "${DBURL}
        $TOKEN" | databricks configure --token

        # Configure Databricks Connect for testing
        echo "${DBURL}
        $TOKEN
        ${CLUSTERID}
        0
        15001" | databricks-connect configure
       """
    }
  }
  
  stage('Checkout') { // for display purposes
    echo "Pulling ${CURRENTRELEASE} Branch from Github"
    git branch: CURRENTRELEASE, credentialsId: GITHUBCREDID, url: GITREPOREMOTE
  }
}
