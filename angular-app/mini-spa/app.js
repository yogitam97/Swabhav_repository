angular.module('spa', ['ngRoute'])

    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: "fragments/history.html",
                controller: "HistoryController"
            })
            .when('/politics', {
                templateUrl: "fragments/politics.html",
                controller: "PoliticsController"
            })
            .when('/places', {
                templateUrl: "fragments/places.html",
                controller: "PlacesController"
            })
        })
            .controller("HistoryController", function ($scope) {
                $scope.data = 'Vivamus a risus facilisis, sagittis purus sed, accumsan nisl. Quisque dapibus lectus id elementum dictum. Etiam tincidunt elit in volutpat lacinia. Vestibulum ut ullamcorper nulla. In lobortis tincidunt metus quis ultricies. Sed sed pellentesque mi. Quisque gravida elit ac est rhoncus convallis. Vestibulum eleifend dictum nisi, eu aliquet est laoreet ac. Etiam ac nulla vitae quam posuere fermentum vitae sed diam.';
            })
            .controller("PoliticsController", function ($scope) {
                $scope.data = 'Politics<br>Vivamus a risus facilisis, sagittis purus sed, accumsan nisl. Quisque dapibus lectus id elementum dictum. Etiam tincidunt elit in volutpat lacinia. Vestibulum ut ullamcorper nulla. In lobortis tincidunt metus quis ultricies. Sed sed pellentesque mi. Quisque gravida elit ac est rhoncus convallis. Vestibulum eleifend dictum nisi, eu aliquet est laoreet ac. Etiam ac nulla vitae quam posuere fermentum vitae sed diam.';
            })
            .controller("PlacesController", function ($scope) {
                $scope.data = 'Places<br>Vivamus a risus facilisis, sagittis purus sed, accumsan nisl. Quisque dapibus lectus id elementum dictum. Etiam tincidunt elit in volutpat lacinia. Vestibulum ut ullamcorper nulla. In lobortis tincidunt metus quis ultricies. Sed sed pellentesque mi. Quisque gravida elit ac est rhoncus convallis. Vestibulum eleifend dictum nisi, eu aliquet est laoreet ac. Etiam ac nulla vitae quam posuere fermentum vitae sed diam.';
            });

  