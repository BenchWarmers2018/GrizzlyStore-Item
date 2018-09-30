#!/usr/bin/env bash
echo 'Deployment in progress'
pwd && cd target

if (( $(ps -ef | grep -v grep | grep grizzlystore-item | wc -l) > 0)) 
	then
		echo "Item service is running...attempting to stop service!"
		sudo systemctl stop grizzlystore-item.service || true
fi

if [ -f grizzlystore-item ] ; then
    sudo rm /etc/init.d/grizzlystore-item || true
fi

cp *.jar /opt/GrizzlyStoreMicroServices/grizzlystore-item.jar
sudo systemctl start grizzlystore-item.service