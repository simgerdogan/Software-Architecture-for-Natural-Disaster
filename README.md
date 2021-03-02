# Software-Architecture-for-Natural-Disaster

>This is a ReadMe to understand project info.

---

### Table Of Contents

- [Description](#description)
- [Process](#process)
- [Functional Requirements](#functional-requirements)
- [Languages](#languages)

---

## Description

In this project,  expected to determine a real-world problem and solve the problem by performing an architecture-centric software development including such activities as problem identification, requirements modeling, architectural design, generating code from the design decisions.



### [Back To The Top](#Software-Architecture-for-Natural-Disaster)

---

## Process

Once the problem has been identified, it is now necessary to gather the requirements for your solution.It is necessary to identify and document both functional and non-functional requirements.The functional requirements must be specified with a UML use case diagram, and non-functional requirements must be documented with a Volere template.

It makes and documents architectural design decisions from the structural, behavioral and interaction point of view.First document the design decisions in a natural language (ie English) and then the informal model is converted to a more precise model.XCD is used official software architecture modeling language.It is expected to consider using architectural styles and confirm the choice of style.



### [Back To The Top](#Software-Architecture-for-Natural-Disaster)

---
## Functional Requirements

#### SOS System
There is an emitter port in the sos component.The value of the boolean type sosClick in the sos component is defined as false by default. As the communication protocol, sosClick expects the boolean to be true. When osClick returns true, it calls the validSos () method.

#### Offline Earthquake System
There is an emitter port in the Offline Earthquake Alert component. The value of offlineClick of boolean type in the OfflineEarthquake component is defined as false by default.As the communication protocol, offlineClick expects the boolean to be true.When offlineClick returns true, it calls the validOffline () method.

#### Awareness System
There is an emitter port in the GetAware component. The value of awareClick of boolean type in GetAware component is defined as false by default. The default index of the User array for GetAware component is defined as Single. As a communication protocol, awareClick expects the boolean to be true and assigns the user parameter to promises. When awareClick returns true, it calls the validAware (User user) method.

#### Forum System
There is an emitter port in the forum component.The value of awareClick of boolean type in the forum component is defined as false by default.For the Forum component, the default index of the User array is defined as Single and the default index of the Forum array is On.The value of forumClick of boolean type in the forum component is defined as false by default.As the communication protocol, forumClick expects the boolean to be true and assigns the forum parameter to promises. When forumClick returns true it calls the validEntry (Forum forum) method.
There is also a required port in the forum component. For the Forum component, the default index of the Forum array is defined as On.The value of requestClick of boolean type in the forum component is defined as false by default.As the communication protocol, requestClick expects the boolean to be true.If the chosenForum does not exist, nothing is done, but if it does, requestClick is returned false and it waits until it becomes true again.This shows the communication protocol.

#### Communication System
There are 2 provided ports in the communication component.In the first, the value of the boolean type requestClick in the Forum component is false by default and isCommiAvailable in the boolean type is false by default. As the communication protocol, requestClick expects the boolean to be true.
The first provided port is defined for the transportation and accomodation indexes.As the communication protocol, requestClick expects the boolean to be true and determines the functional contruct as follows:The value of isCommiAvailable for the current task is true unless the requeastClick is None.It returns commiNum for the current task or sends it to NoTaskEleleException as long as requestClick is None.
As the communication protocol for the second provided port, requestClick expects the boolean to be true and sets the functional configuration as follows:The value of isCommiAvailable for the current forum is true unless requeastClick is None.It returns commiNum for the current forum or sends it to NoForumEleleException as long as requestClick is None.

#### Campaign System
There is an emitter port in the Campaign component.In the Campaign component, the value of campaignClick of boolean type is false by default, the default value of chosenCampaign of type boolean is On, and the default index of the User array is defined as Single.As the communication protocol, campaignClick expects the boolean to be true and assigns the campaign parameter to promises.When campaignClick returns true, it calls the validCampaign (Campaign campaign) method.

#### Task System
There is an emitter port in the Task component.In the Task component, the value of requestClick of type boolean is false by default, the default value of isTaskAvailable of type boolean is On, the default value of chosenTask of type boolean is On, the default index of the User array is Single-Pair, and the default index of the Task array is None.
Emitter port is defined for Warming, Food, Others indexes. As the communication protocol, requestClick expects the boolean to be true.It assigns task and user parameters to promises.requestClick returns true.The chosenTask value is synchronized to the task where the user is.It then calls the validTaskInfo (Task task, User user) method.
Task component's only provided port is defined for all indexes of the task array.As the communication protocol, requestClick expects the boolean to be true and the functional contract determines as follows:The value of isTaskAvailable for the current task is true unless requeastClick is None.It returns taskNum for the current task or sends it to NoTaskException as long as requestClick is None.Task component also has a required port.
For the Task component, it is defined for the transportation and accommodation indexes of the Task array.The value of requestClick of type boolean in the Task component is defined false by default.As the communication protocol, requestClick expects the boolean to be true.If the task does not exist, nothing is done, but if it does, requestClick is returned false and it waits until it becomes true again.This shows the communication protocol.If the exception is not happening, still nothing should be done.



---

## Languages

- XCD ( formal software architecture modeling language)
- Java (implementation)


### [Back To The Top](#Software-Architecture-for-Natural-Disaster)

---



