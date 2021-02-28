User = [None,Single,Pair]
TaskName = [Tr,Ac,Wa,Fo,Ot]
Campaign = [Off,On]
Task = [Off,On]
Info = [Off,On]
Forum = [Off,On]

byte ID

abstract class Task {
   function ShowElele()
  function showTask()
  function requestCommiTask()
}

abstract class CheckUserInfo {
   function requestSignUp()
   function receiveSignIn()
   function requestSignout()
   function receiveSignout()
}

interface ShowInfo{//SCREENSHOTTA
  function show()
}

interface Comminucation{//SCREENSHOTTA
  function communicate()
}

interface Add{
  function clickAdd()
}

class Food EXTENDS Task IMPLEMENTS Add {
  function ShowElele(){
    WHILE requestClick is not False:
      requestClick is true
      call validTaskInfo(Task,User)
    END WHILE
  }
  function validTaskInfo(){
    isTaskAvailable is True
  }
  function show(){
    WHILE requestAdd is True:
    IF currentTask is Food
      requestAdd is False
    END IF
    ELSEIF currentTask is not Add
      do nothing
    END ELSEIF
    ELSE
      throw NoTaskException
    END ELSE
  }
  function showTask(){
    WHILE requestClick is not False:
      IF requestClick is not None then
        show currentTask
      END IF
      ELSE
        throw NoTaskException
      END ELSE
    END WHILE
  }
}

class Warming EXTENDS Task IMPLEMENTS Add{
  function ShowElele(){
    WHILE requestClick is not False:
      requestClick is true
      call validTaskInfo(Task,User)
    END WHILE
  }
  function validTaskInfo(){
    isTaskAvailable is True
  }
  function show(){
    WHILE requestAdd is True:
    IF currentTask is Food
      requestAdd is False
    END IF
    ELSEIF currentTask is not Add
      do nothing
    END ELSEIF
    ELSE
      throw NoTaskException
    END ELSE
  }
  function showTask(){
    WHILE requestClick is not False:
      IF requestClick is not None then
        show currentTask
      END IF
      ELSE
        throw NoTaskException
      END ELSE
    END WHILE
  }
}

class Others EXTENDS Task IMPLEMENTS Add {
  function ShowElele(){
    WHILE requestClick is not False:
      requestClick is true
      call validTaskInfo(Task,User)
    END WHILE
  }
  function validTaskInfo(){
    isTaskAvailable is True
  }
  function show(){
    WHILE requestAdd is True:
    IF currentTask is Food
      requestAdd is False
    END IF
    ELSEIF currentTask is not Add
      do nothing
    END ELSEIF
    ELSE
      throw NoTaskException
    END ELSE
  }
  function showTask(){
    WHILE requestClick is not False:
      IF requestClick is not None then
        show currentTask
      END IF
      ELSE
        throw NoTaskException
      END ELSE
    END WHILE
  }
}

class Transportation EXTENDS Task IMPLEMENTS ShowInfo,Add,Comminucation {
  function showTask(){
    WHILE requestClick is not False:
      IF requestClick is not None then
        show currentTask
      END IF
      ELSE
        throw NoTaskException
      END ELSE
    END WHILE
  }
  function validTaskInfo(){
    WHILE eleleClick is not False:
      show validTaskInfo
    END WHILE
    }
    function show(){
      WHILE requestAdd is True:
      IF currentTask is Food
        requestAdd is False
      END IF
      ELSEIF currentTask is not Add
        do nothing
      END ELSEIF
      ELSE
        throw NoTaskException
      END ELSE
    }
    function communicate{
      WHILE requestClick is True:
        IF requestClick is not None then
          start Commi
        END IF
        ELSE
          throw NoTaskEleleException
        END ELSE
      END WHILE
    }
    function requestCommiTask(){
      WHILE requestClick is not False:
      IF currentTask is Transportation
        requestClick is False
      END IF
      ELSEIF currentTask is not Transportation
        do nothing
      END ELSEIF
      ELSE
        throw NoTaskEleleException
      END ELSE
  }
}

class Accomodation EXTENDS Task IMPLEMENTS ShowInfo,Add,Comminucation{
  function showTask(){
    WHILE requestClick is not False:
      IF requestClick is not None then
        show currentTask
      END IF
      ELSE
        throw NoTaskException
      END ELSE
    END WHILE
  }
  function validTaskInfo(){
  WHILE eleleClick is not False:
    show validTaskInfo
  END WHILE
  }
  function show(){
    WHILE requestAdd is True:
    IF currentTask is Food
      requestAdd is False
    END IF
    ELSEIF currentTask is not Add
      do nothing
    END ELSEIF
    ELSE
      throw NoTaskException
    END ELSE
  }
  function communicate{
    WHILE requestClick is True:
      IF requestClick is not None then
        start Commi
      END IF
      ELSE
        throw NoTaskEleleException
      END ELSE
    END WHILE
  }
  function requestCommiTask(){
    WHILE requestClick is not False:
    IF currentTask is Accomodation
      requestClick is False
    END IF
    ELSEIF currentTask is not Accomodation
      do nothing
    END ELSEIF
    ELSE
      throw NoTaskEleleException
    END ELSE
  }
}

class Campaign IMPLEMENTS ShowInfo{
  function showCampaign(){
    WHILE campaignClick is not False:
      campaignClick is true
      call validCampaign(Campaign)
    END WHILE
  }
  function validCampaign(){
    chosenCampaign is On
  }
  function show(){
    WHILE campaignClick is True
       show currentCampain
    END WHILE
  }
}

class Forum IMPLEMENTS ShowInfo,Comminucation{
  function showEntry(){
    WHILE forumClick is not False:
      forumClick is true
      call validEntry(Forum)
    END WHILE
  }
  function validEntry(){
    chosenForum is On
  }
  function show(){
    WHILE forumClick is True
       show currentForum
    END WHILE
  }
  function communicate{
    WHILE requestClick is True:
      IF requestClick is not None then
        start Commi
      END IF
      ELSE
        throw NoForumEleleException
      END ELSE
    END WHILE
  }
  function requestCommIForum(){
    WHILE requestClick is not False:
    IF currentForum is On
      requestClick is False
    END IF
    ELSEIF currentForum is not On
      do nothing
    END ELSEIF
    ELSE
      throw NoForumEleleException
    END ELSE
}
}

class EditInfo IMPLEMENTS Show{
  function show(){
    WHILE infoClick is True
       show currentInfo

       IF currentInfo is change then
        click SaveButton
      END IF

      ELSE
        do nothing

      END ELSE
    END WHILE
  }
}


class GetAware IMPLEMENTS Show{
  function show(){
    WHILE awareClick is True
       show currentAware
    END WHILE
  }
}

class SignUp EXTENDS CheckUserInfo{
  function requestSignUp(){
    WHILE requestClick is True:
    IF currentUser is not chosenUser
      do nothing
    END IF
    ELSEIF currentUser is chosenUser
      chosenUser is equal to userId
    END ELSEIF
    ELSE
      throw AlreadyException
    END ELSE
  }
}

class SignIn EXTENDS CheckUserInfo{
  function receiveSignIn(){
    WHILE requestClick is True:
    IF currentUser is chosenUser AND currentPassword is chosenPassword
      chosenUser is equal to userId
    END IF
    ELSEIF currentUser is not chosenUser OR currentPassword is not chosenPassword
      chosenUser is not equal to userId
    END ELSEIF
    ELSE
      throw AlreadyException
    END ELSE
  }
  function requestSignout(){
    WHILE requestClick is True:
    IF currentUser is chosenUser
      chosenUser is equal to userId
    END IF
    ELSEIF currentUser is chosenUser
      do nothing
    END ELSEIF
    ELSE
      throw NoSignInException
    END ELSE
}
}

class Sos IMPLEMENTS ShowInfo{
function GetSos(){
  WHILE sosClick is True
     show currentSos
     call validSos()
  END WHILE
}
function validSos(){
  currentSos is True
}
function show(){
  WHILE sosClick is True
     show currentSos
  END WHILE
}
}

class OfflineEarth IMPLEMENTS ShowInfo{
function Offline(){
  WHILE offlineClick is True
     show currentAlert
     call   validOffline()
  END WHILE
}
function validOffline(){
  currentAlert is True
}
function show(){
  WHILE offlineClick is True
     show currentAlert
  END WHILE
}
}
