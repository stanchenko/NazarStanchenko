# NazarStanchenko
Repo for Homework ITEA
LESSON 01

Теория

GIT
git config --global user.name «my name»
git config --global user.email «my email»

git init инициализация репозитория
git clone git@github.com:user_name/repository.git.  - клонирование репозитория

git add .
git commit -m «fix issure» фиксирование изменений

git commit -a   -- amend

git pull origin master  - скачивание изменений с удаленного хранилища
git push origin my_branch - отправка изменений на удаленный репозиторий

git status

git checkout -b my_branch origin/master   -  создать ветку my_branch от master(remote) и переключиться на эту ветку


Практика

git version
git config --global user.name «my name»
git config --global user.email «my email»

git config --list
git config --list --show-origin


Добавление удаленного репозитория
git remote add origin git@github.com:KDV911/pc.git
git push origin master

удаление удаленного репо
git remote remove origin
￼

git checkout -b firstBranch origin/master.
git checkout -b secondBranch origin/master
git branch

￼

прежде чем делать слив в удаленный репозиторий рекомендуется стянуть с удаленного репозитория все изменения командой git pull

git fetch это частичная команда от команды git pull = git fetch + git merge


отмена изменений (изменения копируются в хеш и потом эти изменения можно применить на другой ветке)



git stash. (отменяет изменения сделанные до последнего комета)
git stash list (просмотр отмененных изменений, может быть несколько и потом указал уникальный номер изменения можно применить его к конкретной ветке)
git stash apply
git stash apply stash(0)
￼

git stash apply  применяет но не удаляет этот хэш послу применения
git stash pop применяет изменения но они удаляются их кэша и больше их применить нельзя

git cherry-pick команда ля переноса комиков



Работа IntelliJ IDEA

gitignore
каждая строка это новый шаблок
/ обозначает что речь идет про дирректорию
*.xml  все файлы с таким расширениям будут игнорироваться
!misc.xml - все файлы будут исключаться кроме файла misc.xml об будит косматится

git revert HEAD


origin - дефолтное название удаленного репозитория

git reset - перемещает

разница между merge и rebase - rebase не сохраняет историю комитов

https://dou.ua/forums/topic/33455/ - информация по stash cherry-pick revert rebase

LESSON_2
